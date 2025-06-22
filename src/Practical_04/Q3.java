package Practical_04;

public class Q3 {
    public static void main(String[] args) {
        String[] nameArray = {"A","B","C","D","E"};
        int[] gampahaVoteArray = {12453, 23457, 74129, 202, 87};
        int[] colomboVoteArray = {89023,41900,23000,57,5};
        int[] kalutharaVoteArray = {60250,35890,56000,354,457};

        List nameList = new List(nameArray.length);
        List gampahaList = new List(gampahaVoteArray.length);
        List colomboList = new List(colomboVoteArray.length);
        List kalutharaList = new List(kalutharaVoteArray.length);
        List totalVote = new List(nameArray.length);

        for (int i = 0; i < nameArray.length; i++) {
            nameList.add(nameArray[i]);
            gampahaList.add(gampahaVoteArray[i]);
            colomboList.add(colomboVoteArray[i]);
            kalutharaList.add(kalutharaVoteArray[i]);
            totalVote.add(gampahaVoteArray[i]+colomboVoteArray[i]+kalutharaVoteArray[i]);
        }

        int gampahaWinner = gampahaList.get(0);
        int colomboWinner = colomboList.get(0);
        int kalutaraWinner = kalutharaList.get(0);

        int finalWinner = totalVote.get(0);

        int gampahaLooser = gampahaList.get(0);
        int colomboLooser = colomboList.get(0);
        int kalutaraLooser = kalutharaList.get(0);

        for (int i = 0; i < nameList.size(); i++) {
            if (gampahaList.get(i) > gampahaWinner)
                gampahaWinner = gampahaList.get(i);
            if (colomboList.get(i) > colomboWinner)
                colomboWinner = colomboList.get(i);
            if (kalutharaList.get(i) > kalutaraWinner)
                kalutaraWinner = kalutharaList.get(i);

            if (totalVote.get(i) > finalWinner)
                finalWinner = totalVote.get(i);

            if (gampahaList.get(i) < gampahaLooser)
                gampahaLooser = gampahaList.get(i);
            if (colomboList.get(i) < colomboLooser)
                colomboLooser = colomboList.get(i);
            if (kalutharaList.get(i) < kalutaraLooser)
                kalutaraLooser = kalutharaList.get(i);
        }

        System.out.println("Gampaha winner is : "+nameList.getStr(gampahaList.indexOf(gampahaWinner)));
        System.out.println("Colombo winner is : "+nameList.getStr(colomboList.indexOf(colomboWinner)));
        System.out.println("Kalutara winner is : "+nameList.getStr(kalutharaList.indexOf(kalutaraWinner)));
        System.out.println();
        System.out.println("The winner of western province : "+nameList.getStr(totalVote.indexOf(finalWinner)));
        System.out.println();
        System.out.println("Gampaha lower is : "+nameList.getStr(gampahaList.indexOf(gampahaLooser)));
        System.out.println("Colombo lower is : "+nameList.getStr(colomboList.indexOf(colomboLooser)));
        System.out.println("Kalutara lower is : "+nameList.getStr(kalutharaList.indexOf(kalutaraLooser)));
        System.out.println();

        System.out.println("eligible parties for at-least one seat");
        for (int i = 0; i < totalVote.size(); i++) {
            if (totalVote.get(i) > 100000){
                System.out.println(nameList.getStr(totalVote.indexOf(totalVote.get(i))));
            }
        }

    }
}
