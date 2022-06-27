package efg;

public class InnerClassesEx {

	public static void main(String[] args) {
	outer.InnerNonStatic in=new outer().new InnerNonStatic();
	outer.InnerStatic ins = new outer.InnerStatic();
	in.met();
	ins.met();
	}
	}
	class outer{
		void NonStaticmet () {
			System.out.println("outer class met called");
		}
		static void Staticmet() {
			System.out.println("Static met of class outer called");
		}
		static class InnerStatic{
			public void met() {
				System.out.println("Inner Static class met called");
				Staticmet();
			}
	}
		class InnerNonStatic{
			public void met() {
				System.out.println("Inner  Non Static class called");
				Staticmet();
				NonStaticmet();
			}
		}
	}

