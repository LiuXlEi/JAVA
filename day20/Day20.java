

//观察子类实现接口&父接口间的相互转换

    interface IMessage{
        public static final String MSG = "I am a student" ; // 全局常量
        public abstract void print() ; // 抽象方法
        }
        interface INews {
        public abstract String getNews() ;
        }
        class MessageImpl implements IMessage,INews {
            public void print() {
                System.out.println(IMessage.MSG) ;
                }
                public String getNews(){
                return IMessage.MSG ; // 访问常量都建议加上类名称
                }
         }
        
        public class Day20{
            public static void main(String[] args) {
            IMessage m = new MessageImpl() ; //子类向上转型,为父接口实例化对象
            m.print() ; // 调用被子类覆写过的方法
            INews n = (INews) m ;
            System.out.println(n.getNews()) ;
            }
            }