package Internet;
	import java.io.IOException;
	import java.net.URISyntaxException;
import java.util.ArrayList;
	
	
 	
	
	public class GoogleMaps {
  
		private String mahalle="";
		private String sokak="";
		private String cadde="";
		private String il="";
		private String il�e="";
		private String bulvar="";
		private String postaKodu="";
		private String no ="";
	
	    public String maps ="https://www.google.com.tr/maps/place/";
	 
	     
	    
	    
	       public void ConnectMaps(String Address) throws IOException, URISyntaxException {
	    	   
	    	   String url=maps+Address;
	    	   
	    	   
	    		java.awt.Desktop.getDesktop().browse(new java.net.URI(url));
	       }
	       
	       public String GoogleMapsFindAddress(String Address) {
	    	   // mahalle , Sokak , Cadde , �l / il�e ,bulvar
	    	  String[] retval = new String[100];
	    			
	    	   Address=Address.toLowerCase();
	    	   if(Address.contains("mahallesi") || Address.contains("mah.") ) {
	    		   Address= Address.replace("mahallesi", "mahallesi,");
	    		   Address= Address.replace("mah.", "mahallesi,");
	    		//   System.out.println( Address);
	    	   }
	    	  
	    	   if(Address.contains("sokak") || Address.contains("sok.") ) {
	    		   Address= Address.replace("sokak", "sokak,");
	    		   Address= Address.replace("sok.", "sokak,");
	    		  // System.out.println( "sok:"+Address);
	    	   }
	    	   
	    	   if(Address.contains("cad.")||Address.contains("caddesi")) {
	    		   Address= Address.replace("caddesi", "caddesi,");
	    		   Address= Address.replace("cad.", "caddesi,");
	    		   //System.out.println("cad:"+Address);
	    	   }
               if(Address.contains("bulvar�")||Address.contains("blv.")) {
            	  Address= Address.replace("bulvar�", "bulvar�,");
             	  Address= Address.replace("blv", "blv.,");
             	 //System.out.println("blv.:"+bulvar);
               }
               if(Address.contains("no:") || Address.contains("no") ) {
                 int indx=Address.indexOf(Address.substring(Address.indexOf("no")));
                 String no = "";
                 for(int i = indx; ;i++) {
					if(  Character.isDigit(Address.charAt(i))) {
                	 no +=Address.charAt(i)+"";
				
					}
					else if(!no.equals(""))
						break;
                 }
            	  Address= Address.replace("no:"+no, "no:"+no+",");
            	  //System.out.println("no"+Address);
               }
               
               retval = Address.split(", ");
               for(int i = 0 ; i<retval.length;i++) {
            	//   System.out.println(retval[i]);
            	   if(retval[i].contains("mahallesi"))
            		  mahalle=retval[i];
            	   else if(retval[i].contains("sokak"))
            		   sokak=retval[i];
            	   else if(retval[i].contains("cadde")) {
            		   cadde=retval[i];
            		 //  System.out.println(cadde);
            	   }
            	   
            	   else if(retval[i].contains("bulvar") || retval[i].contains("blv."))
            		     bulvar=retval[i];
            	   else if(retval[i].contains("no"))
            		     no = retval[i];
            	   else if(i==retval.length-1) {
            		  // System.out.println(retval[i]);
            		   
            		   postaKodu =retval[i].substring(0,retval[i].indexOf(" "));
            		   il�e=retval[i].substring(retval[i].indexOf(" ")+1,retval[i].indexOf("/"));
            		   il=retval[i].substring(retval[i].indexOf("/")+1);
            	   }}
                 
                  mahalle =(mahalle.replace(" ", "+"));
                   sokak=(sokak.replace(" ", "+"));
                   cadde=(cadde.replace(" ", "+"));
                   bulvar=(bulvar.replace(" ", "+"));
                  no=(no.replace(" ", "+"));
                   
            	   il =il+"%2F"+il�e;
            	 //  System.out.println(il);
            	   //System.out.println(postaKodu.replace(" ", "+"));
            	   Address =mahalle+","+"+"+cadde+"+"+no+",+"+postaKodu+"+"+il;
            			   //Balkiraz+Mahallesi,+Mamak+Cd.+No:10,+06620+Mamak%2FAnkara/))
            	   // e�er bo� gelirse direkt relapca ile bosluklar� "" de�i�ter ve formata ekle
               return Address;
	       }
		
		public static void main (String []args) throws IOException, URISyntaxException {
			
			GoogleMaps test = new GoogleMaps();
			String a=test.GoogleMapsFindAddress( "Balkiraz Mahallesi Mamak Caddesi No:10 06620 Mamak/Ankara");
	        test.ConnectMaps(a);
			
		}
	}


