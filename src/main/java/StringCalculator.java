public class StringCalculator {
    public static int add(String numbers) {
        int returnValue=0;
        String[] numbersArray = numbers.split(",|\n");
        if (numbersArray.length > 2) {
            throw new RuntimeException("Up to 2 numbers separated by comma (,) are allowed");
        }
        else {
            for (String number : numbersArray) {
                if (!number.trim().isEmpty()) {
                    int num = Integer.parseInt(number.trim());
                    if(num < 0)
                    {
                        throw new IllegalArgumentException("No negative numbers");
                    }
                    if(num > 1000)
                    {
                        num = 0;
                    }
                    returnValue+=num; // If it is not a number, parseInt will throw an exception
                }
            }
        }
        return returnValue;
    }
}

