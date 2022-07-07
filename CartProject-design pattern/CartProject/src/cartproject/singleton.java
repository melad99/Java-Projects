
package cartproject;


class singleton {

    public String w;
    private static singleton instance = null;
    private static int count = 1;
    private static int num = 3;

    private singleton() {

    }

    public static singleton getInstance() {
        if(count > num){
            instance = null;
            System.out.println("the Offer has been ended");
        }
        else{
            instance = new singleton();
        System.out.println("the Number " + count++ + " is Token Now");
        }
        return instance;
        
    }

    public void test (){
        System.out.println("test");
    }
}
