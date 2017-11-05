package sqlTable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class KanVerici {

	        private int _flag ;
	 		private String _TELEPHONE;  
	 		private int _age; 
	 		private int _raport;
	 		
	 		private char _sex;
	 		
	 		 
	 		private String _EMAIL;
	 		private String _fname;
            private String _mname;
            private String _lname;
            private String _userPassword;
            private String _bloodType;
            private String _PLATE;
            private String _address;
            private String _city ;
            private String _town;
            private String _bloodTypeNum ;
            public Connection con = null;
        	public PreparedStatement pst = null;
  	        public ResultSet rs = null;
  	        public Statement stmt = null;
  	        public String sql=null;
  	        public KanVerici() {
  	        	
  	        }
  	      
            
             
            // if(flag 1) DONOR
            public KanVerici( int flag,String telephone,String email,String fname,
    		String mname,String lname,String pass,
 		   String bloodType,String town,String city,int raport,char sex,int age) throws SQLException {
            	
            	 _flag=flag;
             	_TELEPHONE=telephone;
             	_EMAIL=email;
             	_fname = fname;
             	_mname=mname;
             	_lname=lname;
             	_userPassword=pass;
             	_bloodType=bloodType;
             	_town=town;
             	_city = city;
            	_raport =raport;
            	_sex=sex;
            	_age = age;
            	System.out.println(flag);
            	Insert(_flag);
            	
            }
             //if(flag 2) HASTANE
            public KanVerici ( int flag,String telephone,String email,String fname,String pass,
          		   String bloodType,String town,String city,String bloodTypeNum) throws SQLException {
            	 
            	_flag=flag;
              	_TELEPHONE=telephone;
              	_EMAIL=email;
              	_fname = fname;
              	_userPassword=pass;
              	_bloodType=bloodType;
              	_town=town;
              	_city = city;
            	//_address = address;
            	_bloodTypeNum=bloodTypeNum;
            	
            	System.out.println(flag);
            	Insert(_flag);
           
            }
            
            //if(flag 3 ) KIZILAY OTOBUSU
            public KanVerici  ( int flag,String telephone,String email,String fname,String pass,
           		   String bloodType,String town,String city,String plate,String bloodTypeNum,String address) throws SQLException {
            	_fname=fname;
            	_flag=flag;
              	_TELEPHONE=telephone;
              	_EMAIL=email;
              	_bloodType=bloodType;
              	_town=town;
              	_city = city;
            	_PLATE=plate;
            	_address=address;
            	_bloodTypeNum=bloodTypeNum;
            	//System.out.println(otobus._EMAIL);
            	System.out.println(flag);
            	Insert(_flag);
  	
            }
  
            private void Connection () {

				try {

					con = DriverManager.getConnection(
							"jdbc:postgresql://localhost/KANBUL", "postgres",
							"123456");
					
				} catch (SQLException e) {

					System.out.println("Connection Failed! Check output console");
					e.printStackTrace();
					return;
				}
				if (con != null) {
					System.out.println("You made it, take control your database now!");
				} else {
					System.out.println("Failed to make connection!");
				}
            	
            	
            	
            }
            private boolean Exist(String _TELEPHONE,String _EMAIL) throws SQLException {
            	
            	Connection ();
            	pst = con.prepareStatement("SELECT * FROM \"kan_verici\" WHERE telephone='"+_TELEPHONE+"' and email='"+_EMAIL+"'");
		        rs = pst.executeQuery();
		        String check=null;
		          while (rs.next()) {
		               check=rs.getString(2)+" ";
		            }
		          
		          if(check==null) {
		                	return false;
		                 }
		                else 
		                	return true;

            }
            
            private void Insert(int flag) throws SQLException {
            	
            	Connection();
            	stmt = con.createStatement();
            	
            	if(flag==1) {        		
                    sql="INSERT INTO \"kan_verici\" VALUES"
            			+" ("+"'"+_flag+"' ,"+"'"+_TELEPHONE+"' ,"+"'"+_EMAIL+"',"+"'"+
            			     _fname+"'," +"'"+_mname+"',"+"'"+_lname+"',"+"'"+_userPassword+"', '"+_sex+"', '"+_age+"', '"
            			      +_city+"', '"+_town+"', '"+_raport+"', '"+_bloodType+"',"+null+","+""+null+","+""+null+")";
               //     System.out.println(sql);
                    stmt.executeUpdate(sql);
                    stmt.close();
            	}
            	//
            	else if (flag==2)
            	{
            		
            		sql="INSERT INTO \"kan_verici\" VALUES"
                			+" ("+"'"+_flag+"' ,"+"'"+_TELEPHONE+"' ,"+"'"+_EMAIL+"',"+"'"+
                			     _fname+"'," +""+null+","+""+null+","+"'"+_userPassword+"',"+null+","+null+",'"
                			      +_city+"', '"+_town+"',"+null+", '"+_bloodType+"',"+null+","+"'"+_bloodTypeNum+"',"+""+null+")";
            		System.out.println(sql);
            		stmt.executeUpdate(sql);
            		
                    stmt.close();
            	}
            	
            	else {
            		
            		sql="INSERT INTO \"kan_verici\" VALUES"
                			+" ("+"'"+_flag+"' ,"+"'"+_TELEPHONE+"' ,"+"'"+_EMAIL+"',"+"'"+
                			     _fname+"'," +""+null+","+""+null+","+""+null+","+null+","+null+",'"
                			      +_city+"', '"+_town+"',"+null+", '"+_bloodType+"','"+_PLATE+"',"+"'"+_bloodTypeNum+"',"+"'"+_address+"')";
            		System.out.println(sql);
            		stmt.executeUpdate(sql);
            		
                    stmt.close();
            		
            	}
            	
            }
            

            
            
			public static void main(String [] args) throws SQLException {
               
		 // REMARK! :Sql le baðladýðýn her class da olmak zorunda !!
				
			/*( int flag,String telephone,String email,String fname,
    		String mname,String lname,String pass,
 		   String bloodType,String town,String city,int raport,char sex,int age)
	          */
				
				
		/* YORUM SATIRINI AÇMAYINIZ
				KanVerici person = new KanVerici (1,"5076031496","asuman@gmail.com","Asuman","Rana","Acartürk","asuman123"
						,"ABRh+","Çankaya","Ankara",1,'F',21);
				KanVerici person = new KanVerici (2,"3122126666","GMKDevletHastanesi@gmail.com","Gazi Mustafa Kemal Devlet Hastanesi","gmk123"
						,"0Rh+ 0Rh- ARh+ ARh- BRh+ BRh- ABRh+ ABRh-","Çankaya","Ankara","21 45 3 4 0 41 3 4");
						KanVerici person = new KanVerici (3,"3122126666","kizilaymeydan@gmail.com","Kýzýlay Meydan KAB","kizilay123"
						,"0Rh+ 0Rh- ARh+ ARh- BRh+ BRh- ABRh+ ABRh-","Kýzýlay","Ankara","06ET653","1 5 3 4 0 1 3 4","Atatürk Bulvarý Kýzýlay AVM Önü" );
	        */
				//Kýzýlay Meydan KAB Adres : Atatürk Bulvarý Kýzýlay AVM Önü Kýzýlay/Çankaya/ANKARA
				
			}
}
