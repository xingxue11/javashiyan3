package service;

public class Computer {
   private CPU cpu;
   private Monitor monitor;
   public Computer() {
      // 实例化内部部件
      cpu = new CPU("i7-14700K", 3.4);
      monitor = new Monitor(27.0);
   }

   // 5. start开机方法，调用cpu.run() monitor.show()
   public void start() {
      System.out.println("====电脑开机====");
      cpu.run();
      monitor.show();
      System.out.println("====开机完成====");
   }
}

