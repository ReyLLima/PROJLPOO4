package threads;
public class Tarefa_1 extends Thread {
    public Tarefa_1(String name){
        super(name);
    }
    public void run(){
    System.out.println(" ");
    System.out.println(" ");
    System.out.println("Fluxo de programa que está rodando\"1\"");
    System.out.println(" ");
    try{
        Thread.sleep(500);
    }
    catch (InterruptedException e){
    }
    String A = getName();
    System.out.println("Nome da Thread ="+A);
    int b = getPriority();
    System.out.println("Uma thread de prioridade" + b);
    for(int i=0;i<=10;i++){
        System.out.println("-" + i);
    }
    System.out.println(" ");
    System.out.println(" ");
    }
}
