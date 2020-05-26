package security;

import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.SecureRandom;

import org.junit.Ignore;
import org.junit.Test;

public class SecureRandomTest {

	// SecureRandom
	
	
	
	@Test @Ignore
	public void secureRandomTest01() {
		
		final SecureRandom sr = new SecureRandom();
		
		final byte[] byte64 = new byte[64];
		sr.nextBytes(byte64);
		
		int randomInt = sr.nextInt();
		int rangeRandomInt = sr.nextInt(12345);
		
		System.out.println( randomInt );
		System.out.println( rangeRandomInt );
		
	}

	@Test @Ignore
	public void secureRandomTest02() throws NoSuchAlgorithmException, NoSuchProviderException {
		
		final SecureRandom sr = SecureRandom.getInstance("SHA1PRNG");
		
		final byte[] byte64 = new byte[64];
		sr.setSeed(byte64);
		
		@SuppressWarnings("static-access")
		byte[] seeds = sr.getSeed(5); 
		
		for (int i=0, len=seeds.length; i<len; ++i) {
			System.out.println("Seed[" + i + "] : " + seeds[i]);
		}

		
	}
	
	@Test
	public void secureRandomTest03() throws NoSuchAlgorithmException, NoSuchProviderException {
		
		final SecureRandom sr = SecureRandom.getInstance("SHA1PRNG");
		
		byte[] seeds = sr.generateSeed(10);

		for (int i=0, len=seeds.length; i<len; ++i) {
			System.out.println("Seed[" + i + "] : " + seeds[i]);
		}
		
	}
	
}