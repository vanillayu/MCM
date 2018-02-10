enum Letter{A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z}

public class MorseAudios 
{
	private Letter let;
	
	/** Constructor*/ 
	public MorseAudios(Letter l)
	{
		let = l;
	}
	
	/** A method that matches the audio to the letter*/
	public String matchAudio()
	{
		if(let == Letter.A)
		{
			return "Morse Code Alphabet A Alpha.mp3";
		}
		else if(let == Letter.B)
		{
			return "Morse Code Alphabet B Bravo.mp3";
		}
		else if(let == Letter.C)
		{
			return "Morse Code Alphabet C Charlie.mp3";
		}
		else if(let == Letter.D)
		{
			return "Morse Code Alphabet D Delta.mp3";
		}
		else if(let == Letter.E)
		{
			return "Morse Code Alphabet E Echo.mp3";
		}
		else if(let == Letter.F)
		{
			return "Morse Code Alphabet F Foxtrot.mp3";
		}
		else if(let == Letter.G)
		{
			return "Morse Code Alphabet G Golf.mp3";
		}
		else if(let == Letter.H)
		{
			return "Morse Code Alphabet H Hotel.mp3";
		}
		else if(let == Letter.I)
		{
			return "Morse Code Alphabet I India.mp3";
		}
		else if(let == Letter.J)
		{
			return "Morse Code Alphabet J Juliet.mp3";
		}
		else if(let == Letter.K)
		{
			return "Morse Code Alphabet K Kilo.mp3";
		}
		else if(let == Letter.L)
		{
			return "Morse Code Alphabet L Lima.mp3";
		}
		else if(let == Letter.M)
		{
			return "Morse Code Alphabet M Mike.mp3";
		}
		else if(let == Letter.N)
		{
			return "Morse Code Alphabet N November.mp3";
		}
		else if(let == Letter.O)
		{
			return "Morse Code Alphabet O Oscar.mp3";
		}
		else if(let == Letter.P)
		{
			return "Morse Code Alphabet P Papa.mp3";
		}
		else if(let == Letter.Q)
		{
			return "Morse Code Alphabet Q Quebec.mp3";
		}
		else if(let == Letter.R)
		{
			return "Morse Code Alphabet R Romeo.mp3";
		}
		else if(let == Letter.S)
		{
			return "Morse Code Alphabet S Sierra.mp3";
		}
		else if(let == Letter.T)
		{
			return "Morse Code Alphabet T Tanago.mp3";
		}
		else if(let == Letter.U)
		{
			return "Morse Code Alphabet U Uniform.mp3";
		}
		else if(let == Letter.V)
		{
			return "Morse Code Alphabet V Victor.mp3";
		}
		else if(let == Letter.W)
		{
			return "Morse Code Alphabet W Whiskey.mp3";
		}
		else if(let == Letter.X)
		{
			return "Morse Code Alphabet X Xray.mp3";
		}
		else if(let == Letter.Y)
		{
			return "Morse Code Alphabet Y Yankee.mp3";
		}
		else if(let == Letter.Z)
		{
			return "Morse Code Alphabet Z Zulu.mp3";
		}
		
		return null;
	}
}
