public class towerofhanoi {

    public static void tower(int n, char s, char h, char d){
        if (n==1){
            System.out.println("Move 1st disk from " + s +" to " + d );
            return;
        }
        tower(n-1, s, d, h);
        System.out.println("Move "+ n +"The disk from"+ s +" to "+d);
        tower(n-1, h, s, d);
    }

    public static void main(String[] args) {
        tower(3, 's', 'h', 'd');
    }
}
