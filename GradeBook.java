import java.util.ArrayList;

public class GradeBook
{
   private double[] scores; //declaring an array to hold double variable type, named scores
   private int scoresSize;

   public int getScoreSize() {
	   return scoresSize;
   }
   
   public String toString(){
	   String allScores = "";
	   for(int index = 0; index < scores.length; index++) {
		   allScores = (allScores + " ") + scores[index];
	   }
	   return (allScores);
   }
   
   /*example of toString method: 
    * 
    *	 public String toString() {
	*		return (this.title+" ("+this.rating+"): Tickets Sold: "+this.soldTickets);
	*	 }
	*
    */
   
   /**
      Constructs a gradebook with no scores and a given capacity.
      @capacity the maximum number of scores in this gradebook
   */
   public GradeBook(int capacity)
   {
      scores = new double[capacity]; //the int variable capacity determines the size of the array
      scoresSize = 0;
   }

   /**
      Adds a score to this gradebook.
      @param score the score to add
      @return true if the score was added, false if the gradebook is full
   */
   public boolean addScore(double score)
   {
      if (scoresSize < scores.length)
      {
         scores[scoresSize] = score; //***if scoresSize(essentially the INDEX for "scores" array)								
         scoresSize++;				 //   is less than the array Length, scoresSize will increase and go up by 1.
         return true;				 //   until the condition is false when it reaches the same number 
      }								 //   as the length of "scores" array
      else
         return false;      
   }

   /**
      Computes the sum of the scores in this gradebook.
      @return the sum of the scores
   */
   public double sum()
   {
      double total = 0;
      for (int i = 0; i < scoresSize; i++)
      {
         total = total + scores[i];
      }
      return total;
   }
      
   /**
      Gets the minimum score in this gradebook.
      @return the minimum score, or 0 if there are no scores.
   */
   public double minimum()
   {
      if (scoresSize == 0) return 0;
      double smallest = scores[0];
      for (int i = 1; i < scoresSize; i++)
      {
         if (scores[i] < smallest)
         {
            smallest = scores[i];
         }
      }
      return smallest;
   }

   /**
      Gets the final score for this gradebook.
      @return the sum of the scores, with the lowest score dropped if 
      there are at least two scores, or 0 if there are no scores.
   */
   public double finalScore() 
   {
      if (scoresSize == 0)
         return 0;
      else if (scoresSize == 1)
         return scores[0];
      else
         return sum() - minimum();
   }
}

