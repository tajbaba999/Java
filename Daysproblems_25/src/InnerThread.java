//class Q
//{
//    int num;
//    public void put(int num){
//        this.num=num;
//    }
//    public int get(){
//        return num;
//    }
//}
//
//class Producer implements Runnable{
//    Q q;
//    public Producer(Q q){
//
//    }
//
//    public void setQ(Q q) {
//        this.q = q;
//    }
//
//    @Override
//    public void run() {
//        int i = 0;
//        while (true){
//            q.put(i++);
//            try {
//                Thread.sleep(1000);
//            }catch (Exception e){ }
//        }
//    }
//}
//
//class Consumer implements Runnable
//{
//    Q q;
//}
//public class InnerThread {
//    public static void main(String[] args) {
//
//    }
//}
