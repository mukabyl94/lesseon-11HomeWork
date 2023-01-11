public class Uchburchtuk {
    int a;
    int b;
    int c;

    public void area(){
        int s = (a+b+c)/2;
        System.out.println("Uch burchtuktun ayanty: "+(int)Math.sqrt(s*(s-a)*(s-b)*(s-c)));
    }
}
