package basic_code;

public class Locatore_of_xPath {
	
	public static void main(String[] args) {
		/*
	
	Syntax for different ways of finding xpath
	
	1. normal Relative xpath 
		 //tagname[@attribute_name='attribute_value']
		
		 
	2. By using text method    not stable 
	    //tagname[text()='text_value']      
	    ////h1[starts-with(text(),’in to Twitter’)]  
	     
	
	3. By using regular expression 
       //tagname[Contains(@attribute,'att_value')]
       //tagname[Contains(text(),'text_value')]
       //tagname[Contains(text(),'text_value') and @attribute='att_value']
       //tagname[Contains(text(),'text_value') or @attribute='att_value']
       //tagname[Contains(@attribute,'att_value') or text()='text_value']
       
    4. Xpath for dynamic elements
       //tagname[@attribute='value' and @attribute='value']    
       //tagname[@attribute='value' or @attribute='value'] 
       //tagname[@attribute_name='attribute_value']//tagname[@attribute_name='attribute_value'][index_position]
    
    5. xpath for parent-child relationship
	   //tagname[@attribute_name='attribute_value']/tagname/tagname[index_value]/tagname... 
	   untill not find the element location         not trustable 
    

    	 */
	}
}
