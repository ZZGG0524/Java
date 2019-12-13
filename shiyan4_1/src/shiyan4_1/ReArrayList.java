package shiyan4_1;

import java.util.Arrays;

public class ReArrayList implements ReList{
	private int incSize;
	private Object [] rearraylist;
	private int i=0;
	public ReArrayList(int incSize) {
		if(incSize<=0) {
			this.incSize=5;
		}
		else {
			this.incSize=incSize;
		}
		this.rearraylist=new Object[this.incSize];
	}

	@Override
	public void add(Object obj) {
		// TODO Auto-generated method stub
		if(this.i==rearraylist.length) {
			this.rearraylist=Arrays.copyOf(this.rearraylist,rearraylist.length+this.incSize);//容量每次增加incSize	
		}
		this.rearraylist[i]=obj;
		i++;
	}

	@Override
	public Object get(int index) {
		// TODO Auto-generated method stub
		if(index<0||index>=rearraylist.length) {
			System.err.println("参数错误！");
			return null;
		}
		else{
			return this.rearraylist[index];
		}
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		for(int j=0;j<rearraylist.length;j++) {
			this.rearraylist[j]=null;
		}
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		if(rearraylist.length==0) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return rearraylist.length;
	}

	@Override
	public int capacity() {
		// TODO Auto-generated method stub
		return rearraylist.length*8;
	}

}
