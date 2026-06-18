class TwoDSearch {
    public static boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length<=0){
            return false;
        }
        for(int i = 0;i<matrix.length;i++){
            for(int j = 0;j<matrix[i].length;j++){
                if(matrix[i][j]==target){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String args[]){
        int ar[][] = {
                {1,4,7,8},
                {89,34,56,78},
                {10,9,6,2}
        };
        int target = 99;

        System.out.println("Target Exist or not: "+searchMatrix(ar,target));
    }

}