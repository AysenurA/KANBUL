package sqlTable;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import MenuGuý.BusPage;
/*
 To do list :
 * Update / Delete methods
 *Change the '' for query. 
 */


				public class Kýzýlay {
				private String _name;
				private String _password;
				private String _town;
				private String _city;
				private String _address;
				private String _email;
				private String _plate;
				private String _bloodType;
				private String _bloodTypeNum;
				private String _telephone;
				public  Connection con = null;
				public  PreparedStatement pst = null;
				public ResultSet rs = null;	
				KanVerici person = new KanVerici() ;
			    public int columnCount;
			    public ResultSetMetaData metadata =null ;
				ArrayList<String> list=new ArrayList();
				ArrayList<Integer> list2=new ArrayList();
				String[] total=new String[8];
				int colTot=0;
				public Kýzýlay() {
				   
				}
				public Kýzýlay(String name,String telephone,String password,String town,String city,String plate,String email,String address,String bloodType,String bloodTypeNum) throws SQLException {
						this._name=name;
						this._password=password;
						this._town=town;
						this._city=city;
						this._plate=plate;
						this._address=address;
						this._email=email;
						this._bloodType=bloodType;
						this._bloodTypeNum=bloodTypeNum;
						this._telephone=telephone;
						if(_plate==null) {
						InsertHospital(_name,_password,_town,_city,_address,_email,_bloodType,_bloodTypeNum);
						person = new KanVerici ( 2,_telephone,_email,_name,_password,
					      		   _bloodType,_town,_city,_bloodTypeNum,_address);
						}
						else {
							InsertBus(_name,_password,_town,_city,_plate,_address,_email,_bloodType,_bloodTypeNum);
							person =new KanVerici(3,_telephone,_email,_name,_password,
						       		   _bloodType,_town,_city,_plate,_bloodTypeNum,_address);
						}
							
					}
				public String get_email() {
					return _email;
				}
				public String get_name() {
					return _name;
				}
				public String get_password() {
					return _password;
				}
				public String get_town() {
					return _town;
				}
				public String get_city() {
					return _city;
				}
				public String get_plate() {
					return _plate;
				}
				public String get_address() {
					return _address;
				}
				public String get_bloodType() {
					return _bloodType;
				}
				public String get_bloodTypeNum() {
					return _bloodTypeNum;
				}
				private void Connection() {
					try {
				
						con = DriverManager.getConnection(
								"jdbc:postgresql://localhost/KanBul", "postgres",
								"677192");
				
					} catch (SQLException e) {
				
						System.out.println("Connection Failed! Check output console");
						e.printStackTrace();
						return;
				
					}
					if (con == null) {
							System.out.println("Failed to make connection!");
					}
				}
				
				public String Search(String email) throws SQLException {
					Connection();
				    String s=null;
				        pst = con.prepareStatement("SELECT * FROM \"kizilay\" WHERE email='"+email+"'");
				        rs = pst.executeQuery();
				        while (rs.next()) {
				        	s=rs.getString(7);
				        	System.out.println(s);
				       	}
				   return s;
				}
				
				public  void InsertHospital(String name,String password,String town,String city,String address,String email,String bloodType,String bloodNum) throws SQLException {
					Connection();
				    String s=Search(email);
					if(s!=null) {
						System.out.println("The hospital is already exist");
					}
					else
					{		          
						Statement st = con.createStatement();
						st.executeUpdate("INSERT INTO kizilay" + " VALUES ('"
						+name+"' ,"+"'"+password+"' ,"+"'"+town+"',"+"'"+
				        			     city+"'," +"'"+null+"',"+"'"+address+"',"+"'"+email+"', '"+bloodType+"', '"+bloodNum
				        			     +"')");			                
						//System.out.println(st.toString());
						System.out.println("SÝSTEME EKLENDÝ FROM KIZILAY/HASTANE");
					    }
				}
				public  void InsertBus(String name,String password,String town,String city,String plate,String address,String email,String bloodType,String bloodNum) throws SQLException {
					Connection();
				    String s=Search(email);
					if(s!=null) {
						System.out.println("The bus is already exist");
					}
					else
					{		          
						Statement st = con.createStatement();
						st.executeUpdate("INSERT INTO kizilay" + " VALUES ('"
						+name+"' ,"+"'"+password+"' ,"+"'"+town+"',"+"'"+
				        			     city+"'," +"'"+plate+"',"+"'"+address+"',"+"'"+email+"', '"+bloodType+"', '"+bloodNum
				        			     +"')");			                
						//System.out.println(st.toString());
						System.out.println("SÝSTEME EKLENDÝ FROM KIZILAY/BUS");
					    }
				}
				
				public String[] findBestBus() throws SQLException {
					Connection();
					String g="";
				       String s="";
				       int total=0;
				       int counter=0;
					
					       pst = con.prepareStatement("SELECT fname,plaka,town,city,bloodtypenum FROM \"kan_verici\" WHERE flagnum=3");
					        rs = pst.executeQuery();
					        metadata = rs.getMetaData();
				            columnCount = metadata.getColumnCount();
				            
					        while (rs.next()) {
					        	 for (int i = 1; i <= columnCount; i++) {
					        		
					        			
					        			// System.out.print(s+" ");
					        		 if(i<=columnCount-1) {
					        			 s=rs.getString(i)+" ";
					        			 g=g+s;
					        		 }
					        	   
					        		 
					        		if(i==columnCount) {
					        			s=rs.getString(i)+" ";
					        			 g=g+"*"+s;
					        			 s="";
					        		//	System.out.println();
					        		//	System.out.println(g+" "+s);
					        			list.add(g);
					        			g="";
					        		}
					        		
					       	}
					        	  
					  
					
				}
					      //  System.out.println(g);
					      return findBestBusHelper();
				         
				}
				public String[] findBestBusHelper() throws SQLException {
				  for(int i = 0 ; i<list.size() ;i++)
				  {
					  
					  String type=list.get(i).substring(list.get(i).indexOf("*")+1);
					  total=type.split(" ");
					  for(int j = 0 ; j< total.length ;j++) {
						  colTot=colTot+Integer.parseInt(total[j]);
					  }
					
					  list.set(i,list.get(i).replace(list.get(i).substring(list.get(i).indexOf("*")+1),colTot+"" ));
					  list2.add(i, colTot);
					 // System.out.println(list.get(i));
					  colTot=0;
					 
					 
				  }
					return findMax();
				}
				
				public String [] findMax() throws SQLException {
					int max=0;
					int index=0;
				
					for(int i = 0 ; i<list2.size() ;i++) {
						if(list2.get(i)>max)
						{
							max=list2.get(i);
							index=i;
						}
					}
					
					  String [] a =new String [8];
					  a=list.get(index).split(" ");
					  
					  
					 return a;
				}
				}
