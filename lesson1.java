import java.util.Arrays;
import java.util.Scanner;

public class lesson1 { 
    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");}

    public static void checkSumSign() { 
        int a = 10; 
        int b = 25; 
        if (a + b > 0) {System.out.println("Сумма положительная");} 
        else {System.out.println("Сумма отрицательная");} } 

    public static void printColor() { 
        int value = 25; 
        if (value <= 0) {System.out.println("Красный");}  
        else if (value <= 100) {System.out.println("Желтый");} 
        else {System.out.println("Зеленый");}}

    public static void compareNumbers() { 
        int a = 63; 
        int b = 75; 
        if (a >= b) {System.out.println("a >= b");} 
        else {System.out.println("a < b ");}} 

    public static boolean task5 () {
        Scanner sc = new Scanner(System.in); 
        System.out.println("Введите первое число:");
        int num1 = sc.nextInt();  
        System.out.println("Введите второе число:");
        int num2 = sc.nextInt(); 
        return  num1 + num2 >= 10 && num1 + num2 <= 20;}  

    public static void task6() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");
        int num = sc.nextInt();
        if (num >= 0) { System.out.println("Число положительное");} 
        else {System.out.println("Число отрицательное");}}

    public static boolean task7 () {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");
        int num = sc.nextInt();
        return num>=0;} 
    
    public static void task8 () { 
        Scanner sc = new Scanner(System.in); 
        System.out.println("Введите число повторений:"); 
        int num = sc.nextInt(); 
        sc.nextLine();  
        System.out.println("Введите строку, которую надо повторить:");
        String stroka = sc.nextLine();  
        for (int i = 0; i < num; i++) {
            System.out.println(stroka);}}
    
    public static boolean task9() {
        Scanner sc = new Scanner(System.in); 
        System.out.println("Введите год:"); 
        int year = sc.nextInt(); 
        return (year % 400 == 0) || (year % 100 != 0 && year % 4 == 0);}  
    
    public static void task10() {
        int[] array = {1, 0, 1, 1, 0, 0, 1};  
        System.out.println("Исходный массив"); 
        System.out.println(Arrays.toString(array)); 
        for (int i = 0; i < array.length; i++){ 
            if (array[i] == 1) {array[i] = 0;}  
            else {array[i] = 1;}}
        System.out.println("Замененный массив");  
        System.out.println(Arrays.toString(array));} 

    public static void task11() {
        int[] new_array = new int[100];  
        for (int i = 0; i < 100; i++) {  
            new_array[i] = i + 1;}
        System.out.println(Arrays.toString(new_array));}

    public static void task12() { 
        int [] array_1 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1}; 
        System.out.println("Исходный массив"); 
        System.out.println(Arrays.toString(array_1)); 
        for (int i=0; i<array_1.length; i++) { 
            if (array_1[i] < 6) {array_1[i] = array_1[i] * 2;}} 
        System.out.println("Замененный массив");  
        System.out.println(Arrays.toString(array_1));} 
    

        public static void task13() {
            int[][] matrix = { {0, 0, 0}, {0, 0, 0} };
            for (int i = 0; i < matrix.length; i++) {
                matrix[i][i] = 1;
                if (matrix[i].length == matrix.length) {
                    matrix[i][matrix.length - 1 - i] = 1;}}
            for (int[] row : matrix) {
                System.out.println(Arrays.toString(row));}}  
        
        public static int[] task14() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите длину массива:");
            int len = sc.nextInt();     
            System.out.println("Введите значение для заполнения:");
            int initialValue = sc.nextInt();
            int[] array = new int[len];
            Arrays.fill(array, initialValue);   
            return array;}


    public static void main(String[] args) {
        System.out.println("Задание 1:"); printThreeWords();   
        System.out.println("Задание 2:"); checkSumSign();   
        System.out.println("Задание 3"); printColor(); 
        System.out.println("Задание 4"); compareNumbers();
        System.out.println("Задание 5"); System.out.println(task5());
        System.out.println("Задание 6"); task6(); 
        System.out.println("Задание 7"); System.out.println(task7());
        System.out.println("Задание 8"); task8(); 
        System.out.println("Задание 9"); System.out.println(task9()); 
        System.out.println("Задание 10"); task10(); 
        System.out.println("Задание 11"); task11(); 
        System.out.println("Задание 12"); task12(); 
        System.out.println("Задание 13"); task13(); 
        System.out.println("Задание 14");System.out.println(Arrays.toString(task14()));
}}