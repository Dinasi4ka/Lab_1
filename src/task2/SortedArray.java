package task2;

public class SortedArray {
    public static void main(String[] args) {

        String[] inputArray = {"aAbcB1C23", "HelloWorld", "Java"};

        sortArray(inputArray);

        for (String str : inputArray) {
            System.out.println(str);
        }
    }

    private static int countUppercaseLetters(String str) {
        int count = 0;
        for (char c : str.toCharArray()) {
            if (Character.isUpperCase(c)) {
                count++;
            }
        }
        return count;
    }
    private static void sortArray(String[] array) {

        for (int i = 1; i < array.length-1; i++) {
            if (countUppercaseLetters(array[i]) < countUppercaseLetters(array[i+1])) {

                String temp = array[i];
                array[i] = array[i+1];
                array[i+ 1] = temp;

            }

        }
    }
}
