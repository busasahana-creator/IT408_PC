class L3P2 extends L3P1{
	static int neu=5;
	public static void display(){
		System.out.println(view + neu);
        }
        public int show(){
		super.show();
         	return(view + neu);
         }
         public void pearl(){
		super.display();
         	System.out.println("Iam a child of parent class");
         }
}
               