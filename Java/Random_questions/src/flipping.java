import java.util.Arrays;

public class flipping {
    public static void main(String[] args) {
        int image[][]={{1,1,0},{1,0,1},{0,0,0}};
        System.out.println(Arrays.toString(flipAndInvertImage(image)));

    }
    public static int[][] flipAndInvertImage(int[][] image) {
        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image[i].length; j++) {
//                if(image[i][j]!=0){
//                    image[i][j]=0;
//                }
//                else {
//                    image[i][j]=1;
//                }
                
            }
            
        }
        return image;
    }


    
}
