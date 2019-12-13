package shiyan4_1;

import java.util.Arrays;

public class ReDoubledArrayList implements ReList{
	private int initSize;
	private Object [] redoublearraylist;
	private int i=0;
	public ReDoubledArrayList(int initSize) {
		if(initSize<=0) {
			this.initSize=10;
		}
		else {
			this.initSize=initSize;
		}
		this.redoublearraylist=new Object[this.initSize];
	}

	@Override
	public void add(Object obj) {
		// TODO Auto-generated method stub
		if(i==redoublearraylist.length) {
			redoublearraylist=Arrays.copyOf(redoublearraylist,2*redoublearraylist.length);
		}
		this.redoublearraylist[i]=obj;
		i++;
	}

	@Override
	public Object get(int index) {
		// TODO Auto-generated method stub
		if(index<0||index>=redoublearraylist.length) {
			System.err.println("²ÎÊı´íÎó£¡");
			return null;
		}
		else{
			return redoublearraylist[index];
		}
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		for(int j=0;j<redoublearraylist.length;j++) {
			this.redoublearraylist[j]=null;
		}
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		if(redoublearraylist.length==0) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return redoublearraylist.length;
	}

	@Override
	public int capacity() {
		// TODO Auto-generated method stub
		return redoublearraylist.length*8;
	}
}
