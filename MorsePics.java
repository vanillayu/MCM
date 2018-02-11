
public class MorsePics 
{
	private Letter let;
	
	/** Constructor
	     @param l Represents the letter to be matched*/
	public MorsePics(Letter l)
	{
		let = l;
	}
	
	/** A method that matches the picture to the letter
	    @return Returns a name of the filename that corresponds to let*/
	public String matchPic()
	{
		if(let == Letter.A)
		{
			return "A.PNG";
		}
		else if(let == Letter.B)
		{
			return "B.PNG";
		}
		else if(let == Letter.C)
		{
			return "C.PNG";
		}
		else if(let == Letter.D)
		{
			return "D.PNG";
		}
		else if(let == Letter.E)
		{
			return "E.PNG";
		}
		else if(let == Letter.F)
		{
			return "F.PNG";
		}
		else if(let == Letter.G)
		{
			return "G.PNG";
		}
		else if(let == Letter.H)
		{
			return "H.PNG";
		}
		else if(let == Letter.I)
		{
			return "I.PNG";
		}
		else if(let == Letter.J)
		{
			return "J.PNG";
		}
		else if(let == Letter.K)
		{
			return "K.PNG";
		}
		else if(let == Letter.L)
		{
			return "L.PNG";
		}
		else if(let == Letter.M)
		{
			return "M.PNG";
		}
		else if(let == Letter.N)
		{
			return "N.PNG";
		}
		else if(let == Letter.O)
		{
			return "O.PNG";
		}
		else if(let == Letter.P)
		{
			return "P.PNG";
		}
		else if(let == Letter.Q)
		{
			return "Q.PNG";
		}
		else if(let == Letter.R)
		{
			return "R.PNG";
		}
		else if(let == Letter.S)
		{
			return "S.PNG";
		}
		else if(let == Letter.T)
		{
			return "T.PNG";
		}
		else if(let == Letter.U)
		{
			return "U.PNG";
		}
		else if(let == Letter.V)
		{
			return "V.PNG";
		}
		else if(let == Letter.W)
		{
			return "W.PNG";
		}
		else if(let == Letter.X)
		{
			return "X.PNG";
		}
		else if(let == Letter.Y)
		{
			return "Y.PNG";
		}
		else if(let == Letter.Z)
		{
			return "Z.PNG";
		}
		
		return null;
	}
}
