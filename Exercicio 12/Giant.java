public class Giant{

    private int m_id;
	private static int s_next = 0;
    
    public Giant(){
		m_id = s_next++;
	}
	public void fee(){
		System.out.print(m_id);
		System.out.print("-fee  ");
	}
	public void phi(){
		System.out.print(m_id);
		System.out.print("-phi  ");
	}
	public void pheaux(){
		System.out.print(m_id);
		System.out.print("-pheaux  ");
	}
	
}

public class Command{
    private Giant m_object;
    private Action m_method;

    public Command(Giant object, Action method){
        m_object = object;
        m_method = method;
    }

    public void execute(){
        m_object.m_method();
    }


}

public class Queue<T> {
    
    private int m_add = 0;
    private int m_remove = 0;
    private static int SIZE = 8;
    private int[] m_array = new int[SIZE];

    public Queue(){
      
    }

    public enque(T c){
        m_array[m_add] = c;
        m_add = 0;
    }

    public deque(){
        m_array[m_remove] = 0;
    }
}

public class Main{
    public static void main(String [] args){
        Queue que;
        Command c = new Command(new Giant(), new Action());
    }
}