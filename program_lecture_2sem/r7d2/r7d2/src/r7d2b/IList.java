package r7d2b;

public interface IList {
	//effect: rest
	void setRest(IList rst);
	//is this list the same as that?
	boolean same(IList that);
	//the fist int of this list
	int first();
	//the rest of this list
	IList rest();
	
	boolean isCycle();
	boolean hasCycle();
	boolean sameWithInitial(int initial);
	
}
