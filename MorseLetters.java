enum Letter{A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z}

public class MorseLetters 
{
	private String [] submiss;

	public MorseLetters(String word)
	{
		submiss = new String[word.length()];
		
		for(int i = 0; i < word.length(); i++)
		{
			submiss[i] = Character.toString(word.charAt(i));	
		}
	}
	
	public String [] getSubmiss() 
	{
		return submiss;
	}

	public void setSubmiss(String [] submiss) 
	{
		this.submiss = submiss;
	}  
	
	public Letter matchLetter(String let)
	{	
		char chara = let.charAt(0);
		
    /** Checking to see if the let is a letter or not*/
		if(Character.isLetter(chara) == false)
		{
			/* make an error message*/
			return null;
		}
		
		/** Matching the submission letter with the enumerated letters*/
		if(chara == 'a')
		{
			return Letter.A;
		}
		else if(chara == 'b')
		{
			return Letter.B;
		}
		else if(chara == 'c')
		{
			return Letter.C;
		}
		else if(chara == 'd')
		{
			return Letter.D;
		}
		else if(chara == 'e')
		{
			return Letter.E;
		}
		else if(chara == 'f')
		{
			return Letter.F;
		}
		else if(chara == 'g')
		{
			return Letter.G;
		}
		else if(chara == 'h')
		{
			return Letter.H;
		}
		else if(chara == 'i')
		{
			return Letter.I;
		}
		else if(chara == 'j')
		{
			return Letter.J;
		}
		else if(chara == 'k')
		{
			return Letter.K;
		}
		else if(chara == 'l')
		{
			return Letter.L;
		}
		else if(chara == 'm')
		{
			return Letter.M;
		}
		else if(chara == 'n')
		{
			return Letter.N;
		}
		else if(chara == 'o')
		{
			return Letter.O;
		}
		else if(chara == 'p')
		{
			return Letter.P;
		}
		else if(chara == 'q')
		{
			return Letter.Q;
		}
		else if(chara == 'r')
		{
			return Letter.R;
		}
		else if(chara == 's')
		{
			return Letter.S;
		}
		else if(chara == 't')
		{
			return Letter.T;
		}
		else if(chara == 'u')
		{
			return Letter.U;
		}
		else if(chara == 'v')
		{
			return Letter.V;
		}
		else if(chara == 'w')
		{
			return Letter.W;
		}
		else if(chara == 'x')
		{
			return Letter.X;
		}
		else if(chara == 'Y')
		{
			return Letter.Y; 
		}
		else if(chara == 'z')
		{
			return Letter.Z; 
		}
	
		return null; 			
	}

	
}
