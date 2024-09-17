package threads;
class Tarefa_2 extends Thread{
    public Tarefa_2(String name){
        super(name);
    }
    public void run(){
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Fluxo de programa\"2\"");
        System.out.println(" ");
        String A = getName();
        System.out.println("Nome da thread=" + A);
        int b = getPriority();
        System.out.println("Uma thread de prioridade " + b);
        for(int i=10;i>=0;i--){
            System.out.println("-"+ i);
        }
        System.out.println(" ");
        System.out.println(" ");
    }
}
