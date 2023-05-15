public class DefangIP {
    public static void main(String[] args) {
        String address = "1.1.1.1";
        defangIPaddr(address);
    }
    public static void defangIPaddr(String address) {
            StringBuilder result = new StringBuilder();

            for(int i=0;i<address.length();i++){
                if(address.charAt(i) == '.'){
                    result.append("[.]");
                }
                else{
                    result.append(address.charAt(i));
                }
            }

            System.out.println(result.toString());
        }
}
