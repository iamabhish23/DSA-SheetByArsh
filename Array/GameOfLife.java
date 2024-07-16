class Solution {
    public void gameOfLife(int[][] board) {
        if (board == null || board.length == 0) return;
        int m = board.length;
        int n = board[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int liveNeighbors = countLiveNeighbors(board, i, j);
                
                if (board[i][j] == 1 && (liveNeighbors < 2 || liveNeighbors > 3)) {
                    board[i][j] = 2; 
                }
                
                if (board[i][j] == 0 && liveNeighbors == 3) {
                    board[i][j] = -1; 
                }
            }
        }
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 2) {
                    board[i][j] = 0; // Dead
                }
                if (board[i][j] == -1) {
                    board[i][j] = 1; // Live
                }
            }
        }
    }
    
    private int countLiveNeighbors(int[][] board, int i, int j) {
        int m = board.length;
        int n = board[0].length;
        int count = 0;

        for (int x = i - 1; x <= i + 1; x++) {
            for (int y = j - 1; y <= j + 1; y++) {
                if (x == i && y == j) continue;
                if (x >= 0 && x < m && y >= 0 && y < n && (board[x][y] == 1 || board[x][y] == 2)) {
                    count++;
                }
            }
        }
        
        return count;
    }
}
