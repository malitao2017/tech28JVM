package jvm;

import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;

public class J01heap {
	public static void main(String[] args) {
		byte[] b1=new byte[1024*1024/2];
		byte[] b2=new byte[1024*1024*8];
		b2=null;
		b2=new byte[1024*1024*8];
		System.out.println("Max memory:"+Runtime.getRuntime().maxMemory());
		System.gc();
		System.out.println("Max memory:"+Runtime.getRuntime().maxMemory());
		
		//软引用
		SoftReference<String> r = new SoftReference<String>(null);
		//弱引用
		WeakReference<String> w = new WeakReference<String>(null);
	}
}


