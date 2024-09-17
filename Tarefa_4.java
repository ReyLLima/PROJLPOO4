package threads;
class Tarefa_4 extends Thread{
    public Tarefa_4(String name){
        super(name);
    }
    public void run(){
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Fluxo de programa\"4\"");
        System.out.println(" ");
        String A = getName();
        System.out.println("Nome da thread= "+A);
        int b  = getPriority();
        System.out.println("Uma thread de prioridade" + b);
        for(int i =20;i>=10;i--){
            System.out.println("-*");
        }
        System.out.println(" ");
        System.out.println(" ");
        
    }
}
