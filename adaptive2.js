
//computer always selects rock
//class room exercise 1 Rock, Paper , Scissors week of 04_26_Homeworkbranch3

playRoshambo = function(clientGesture){
	 	if (clientGesture=='rock') {
		result = "tie";

	 }

	 	if (clientGesture=='paper') {
		result = "win";

	 }  

	 	if (clientGesture=='scissors') {
		result = "lose";

	 }    

	 alert("You " + result + "!");

	}

<p>Rock, Paper, or Scissors choose one!</p>
	<a class ="btn btn-danger" href="#" onclick="playRoshambo('rock')">rock</a>
 	<a class="btn btn-primary" href="#" onclick="playRoshambo('paper')">paper</a>
 	<a class="btn btn-warning" href="#" onclick="playRoshambo('scissors')">scissors</a>
	