class Hello {
	public static void main(String[] args){
        System.out.println("hello java!!");
        
        String weekday = "fhdfdf";
        
        switch(weekday) {
		case "SUNDAY" : System.out.println("relax...");
						break;
		case "MONDAY" : System.out.println("still in weekend mode");
						break;
		default: System.out.println("Default value");
        }
//        
//        do {
//        	System.out.println("test");
//        }while(true);
        
        for(;;) {
        	System.out.println("test");
        }
//        while(true) {
//        	System.out.println("test");
//        }
    }
}