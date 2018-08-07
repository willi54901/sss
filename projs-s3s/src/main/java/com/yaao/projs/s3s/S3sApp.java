package com.yaao.projs.s3s;

import java.io.UnsupportedEncodingException;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;

import org.apache.mina.core.buffer.IoBuffer;

import com.yaao.bases.hdomain.s3Config.FsuTable;

public class S3sApp {

	public static void main(String[] args) throws UnsupportedEncodingException, CharacterCodingException {
//		System.out.println("ddddddddddddddddddddddd");
//		FsuTable fsu = new FsuTable();
		
		String s = "你3好";
//		String s= "aa";
		System.out.println(s.length());
		byte[] bytes = s.getBytes("GBK");
		System.out.println(bytes.length);
		
		IoBuffer buf = IoBuffer.allocate(100);
		
		buf.putString(s, 10, Charset.forName("GBK").newEncoder());
		System.out.println(buf);
		buf.flip();
		System.out.println(buf);
		System.out.println("remaining = "+buf.remaining()+ ",limit = "+buf.limit());
		
	}

}
