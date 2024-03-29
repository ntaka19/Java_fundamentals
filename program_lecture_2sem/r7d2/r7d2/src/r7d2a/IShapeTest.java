package r7d2a;


import static org.junit.Assert.*;

import org.junit.Test;
import idraw.*;


/*
 * 
 *可変状態にしたクラス：AShape,Square,Circle,Dot,CartPt
 *AShapeを始めとした図形はmove,drawの意味で命令的である。現実世界における状態の変化をそのまま表せているのでわかりやすい。
 *また、いちいち、同じ値のcartPt,radius,sizeなどを作る必要性がないため、メモリの消費量が抑えられる。
 *
 *作用的な状態のままのクラス：
 *colorはnewしている。color内に特定の変数が作れないため。
 *各図形に対して定義されているmorphは作用的である。なぜなら図形のタイプを変えるにあたって、参照できるものがないから。
 * 
 */


public class IShapeTest {
	Canvas c = new Canvas(300, 300);       
    
    @Test
	public void test() {
    	AShape cir = new Circle(new CartPt(150,150),20);
    	cir.move();
    	assertEquals(145,cir.loc.x);
    	assertEquals(145,cir.loc.y);
    	
    	AShape dot = new Dot(new CartPt(150,150));
    	dot.move();
    	assertEquals(150,dot.loc.x);
    	assertEquals(145,dot.loc.y);
    	
    	AShape squ = new Square(new CartPt(150,150),30);
    	squ.move();
    	assertEquals(145,squ.loc.x);
    	assertEquals(150,squ.loc.y);
    	
    	/*画面上に表示され、morphが動けばテストが通ったことにする*/
    	AShape squ1 = new Square(new CartPt(150,150),30);
    	ShapeWorld w1 = new ShapeWorld(squ1,c);
    	w1.bigBang(400, 400, 0.1);
		
	}
}