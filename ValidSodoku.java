import java.util.HashSet;

public class ValidSodoku {
    public static boolean isValidSudoku(char[][] board) {
        HashSet<Character>[] row=new HashSet[9];
        HashSet<Character>[] col=new HashSet[9];
        HashSet<Character>[] sqr=new HashSet[9];
        for(int i=0;i<9;i++) {
            row[i]=new HashSet<>();
            col[i]=new HashSet<>();
            sqr[i]=new HashSet<>();
        }
        for (int i=0;i<9;i++) {
            for (int j = 0; j <9; j++) {
                if(board[i][j]=='.') continue;
                int square = (i / 3) * 3 + (j / 3);
                if(row[i].contains(board[i][j])||col[j].contains(board[i][j])||sqr[square].contains(board[i][j])) return false;
                row[i].add(board[i][j]); col[j].add(board[i][j]); sqr[square].add(board[i][j]);
            }
        }
        return true;
    }
    public static void main(String[] args) {
        char[][] board = {
                {'5','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'}
        };
        System.out.println(isValidSudoku(board));
    }
}
/*
public boolean isValidSudoku(char[][] board) {

    HashSet<Character>[] rows = new HashSet[9];
    HashSet<Character>[] cols = new HashSet[9];
    HashSet<Character>[] squares = new HashSet[9];

    for (int i = 0; i < 9; i++) {
        rows[i] = new HashSet<>();
        cols[i] = new HashSet<>();
        squares[i] = new HashSet<>();
    }

    for (int i = 0; i < 9; i++) {
        for (int j = 0; j < 9; j++) {

            if (board[i][j] == '.') continue;

            char value = board[i][j];

            int square = (i / 3) * 3 + (j / 3);

            if (rows[i].contains(value) ||
                cols[j].contains(value) ||
                squares[square].contains(value)) {
                return false;
            }

            rows[i].add(value);
            cols[j].add(value);
            squares[square].add(value);
        }
    }

    return true;
}
 */
