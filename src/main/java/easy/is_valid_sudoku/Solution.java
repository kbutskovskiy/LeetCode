package easy.is_valid_sudoku;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean isValidSudoku(char[][] board) {
        Map<Character, Integer> sq1 = new HashMap<>();
        Map<Character, Integer> sq2 = new HashMap<>();
        Map<Character, Integer> sq3 = new HashMap<>();
        for (int i = 0; i < 9; ++i) {
            Map<Character, Integer> rowMap = new HashMap<>();

            if (i == 3 || i == 6) {
                sq1.clear();
                sq2.clear();
                sq3.clear();
            }

            for (int j = 0; j < 9; ++j) {
                char c = board[i][j];
                if (c != '.') {
                    rowMap.compute(board[i][j], (key, value) -> value = value == null ? 1 : value + 1);
                    if (j < 3) {
                        sq1.compute(board[i][j], (key, value) -> value = value == null ? 1 : value + 1);
                    }
                    if (j >= 3 && j < 6) {
                        sq2.compute(board[i][j], (key, value) -> value = value == null ? 1 : value + 1);
                    }
                    if (j >= 6 && j < 9) {
                        sq3.compute(board[i][j], (key, value) -> value = value == null ? 1 : value + 1);
                    }
                }
            }

            if (rowMap.containsValue(2) || rowMap.containsValue(3) || rowMap.containsValue(4)
                    || rowMap.containsValue(5) || rowMap.containsValue(6) || rowMap.containsValue(7)
                    || rowMap.containsValue(8) || rowMap.containsValue(9) ||
                    sq1.containsValue(2) || sq1.containsValue(3) || sq1.containsValue(4)
                    || sq1.containsValue(5) || sq1.containsValue(6) || sq1.containsValue(7)
                    || sq1.containsValue(8) || sq1.containsValue(9) ||
                    sq2.containsValue(2) || sq2.containsValue(3) || sq2.containsValue(4)
                    || sq2.containsValue(5) || sq2.containsValue(6) || sq2.containsValue(7)
                    || sq2.containsValue(8) || sq2.containsValue(9) ||
                    sq3.containsValue(2) || sq3.containsValue(3) || sq3.containsValue(4)
                    || sq3.containsValue(5) || sq3.containsValue(6) || sq3.containsValue(7)
                    || sq3.containsValue(8) || sq3.containsValue(9)) {
                return false;
            }

            rowMap.clear();

            for (int j = 0; j < 9; ++j) {
                char c = board[j][i];
                if (c != '.') {
                    rowMap.compute(board[j][i], (key, value) -> value = value == null ? 1 : value + 1);
                }
            }

            if (rowMap.containsValue(2) || rowMap.containsValue(3) || rowMap.containsValue(4)
                    || rowMap.containsValue(5) || rowMap.containsValue(6) || rowMap.containsValue(7)
                    || rowMap.containsValue(8) || rowMap.containsValue(9)) {
                return false;
            }

        }

        return true;
    }
}