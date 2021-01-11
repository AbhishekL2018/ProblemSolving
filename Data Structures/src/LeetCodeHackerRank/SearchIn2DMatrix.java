package LeetCodeHackerRank;

public class SearchIn2DMatrix {
    public static void main(String[] args) {
        int[][] matrix = new int[3][4];
        matrix[0] = new int[]{1, 3, 5, 7};
        matrix[1] = new int[]{10,11,16,20};
        matrix[2] = new int[]{23,30,34,60};
        System.out.println(searchMatrix(matrix,47));
    }
    public static boolean searchMatrix(int[][] matrix, int target) {
        int row_number = matrix.length;
        int row_element = matrix[0].length;
        int i = 0;
        int j = row_element-1;
        while(i<row_number && j >= 0){
            int val = matrix[i][j];
            if(val == target){
                return true;
            }else if(val > target){
                j--;
            }else{
                i++;
            }
        }
        return false;
    }
}
