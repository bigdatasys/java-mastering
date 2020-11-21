package mastering;

import java.util.Scanner;

public class MainApp {

    private static String[] classIndex = new String[]{
            "String Calculator", "Arrays Methods", "Operators", "Lambdas", "Threads",
            "ThreadsImpl", "HashMapImpl", "HashSetImpl", "IteratorImpl", "LoopsImpl",
            "PatternMatcherImpl"};

    public static void main(String[] args) {

        for(int i=0; i<classIndex.length; i++) System.out.println((i+1) + ". " + classIndex[i]);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Select menu option: ");
        int menuOption = scanner.nextInt();
        System.out.println("Selected menu option: " + menuOption);
        menuOption--;

        if(classIndex[menuOption].equals("String Calculator")) { new Thread(() -> { try {
            StringCalculator stringCalc = new StringCalculator();
            stringCalc.stringCalcutatorTask();
        } catch (Exception ex) { System.out.print("Error: " + ex.toString()); }}).start();}

        if(classIndex[menuOption].equals("Arrays Methods")) { new Thread(() -> { try {
            ArraysMethods arraysMethods = new ArraysMethods();
            arraysMethods.Tasks();
        } catch (Exception ex) { System.out.print("Error: " + ex.toString()); }}).start();}

        if(classIndex[menuOption].equals("Operators")) { new Thread(() -> { try {
            Operators operators = new Operators();
            operators.Tasks();
        } catch (Exception ex) { System.out.print("Error: " + ex.toString()); }}).start();}

        if(classIndex[menuOption].equals("Lambdas")) { new Thread(() -> { try {
            Lambdas lambdas = new Lambdas();
            lambdas.Tasks();
        } catch (Exception ex) { System.out.print("Error: " + ex.toString()); }}).start();}

        if(classIndex[menuOption].equals("Threads")) { new Thread(() -> { try {
            Threads threads = new Threads();
            threads.task();
        } catch (Exception ex) { System.out.print("Error: " + ex.toString()); }}).start();}

        if(classIndex[menuOption].equals("ThreadsImpl")) { new Thread(() -> { try {
            ThreadsImpl threadsimpl = new ThreadsImpl();
            threadsimpl.task();
        } catch (Exception ex) { System.out.print("Error: " + ex.toString()); }}).start();}

        if(classIndex[menuOption].equals("HashMapImpl")) { new Thread(() -> { try {
            HashMapImpl hashmapimpl = new HashMapImpl();
            hashmapimpl.task();
        } catch (Exception ex) { System.out.print("Error: " + ex.toString()); }}).start();}

        if(classIndex[menuOption].equals("HashSetImpl")) { new Thread(() -> { try {
            HashSetImpl hashsetimpl = new HashSetImpl();
            hashsetimpl.task();
        } catch (Exception ex) { System.out.print("Error: " + ex.toString()); }}).start();}

        if(classIndex[menuOption].equals("IteratorImpl")) { new Thread(new Runnable() {
            @Override public void run() { try {
                IteratorImpl iteratorimpl = new IteratorImpl();
                iteratorimpl.task();
            } catch (Exception ex) { System.out.print("Error: " + ex.toString()); }}}).start();}

        if(classIndex[menuOption].equals("LoopsImpl")) { new Thread(new Runnable() {
            @Override public void run() { try {
                LoopsImpl loopsimpl = new LoopsImpl();
                loopsimpl.task();
            } catch (Exception ex) { System.out.print("Error: " + ex.toString()); }}}).start();}

        if(classIndex[menuOption].equals("PatternMatcherImpl")) { new Thread(new Runnable() {
            @Override public void run() { try {
                PatternMatcherImpl patternmatcherimpl = new PatternMatcherImpl();
                patternmatcherimpl.task();
            } catch (Exception ex) { System.out.print("Error: " + ex.toString()); }}}).start();}

    }
}
