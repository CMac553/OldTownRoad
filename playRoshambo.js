//Homework - interactive Rock Paper Scissors exercise 1 - JS in the browser

function greetOnload () {

	var name = prompt("Hi! What;s your name?");
	var myElement = document.getElementById("greeting");
	greeting.innerHtml = "Hello" + name + "Its nice to meet you!";
}	
greetOnload() ;



// var hands = ["rock", "papers", "scissors"]; 

// function gethands() {
// 	 return hands [parseInt(Math.random()* 3)];


// }

// var player1 = {
// 	name: "cyndi",
// 	score:  {
// 		win: 0,
// 		tie: 0,
// 		loose: 0,

// 	}
// }
	
// var player2 = {
// 	name: "artificial intelligence.",
// 	score:  {
// 		win: 0,
// 		tie: 0,
// 		loose: 0,
// 	}
// }

// function playGame(p1, p2) {
// 	p1.hands = gethands();
// 	p2.hands = gethands();
// 		console.log(p1.hands, p2.hands);

// 		if(p1.hands  === p2.hands) {
// 			p1.score.tie++
// 			p2.score.tie++
// 			console.log("This is a Tie")
// 		}
// 		if(p1.hands == "rock") {
// 			if(p2.hands == "papers") {
// 			console.log(p2.name + "won");
// 			}

// 		}
// 		else if (p2.hands === "scissors") {
// 			console.log(p1.name + "won");
// 			p1.score.win ++
// 			p2.score.win ++
// 		}
// }	

// function play() { 
// 	for (var i = 0; i < 5; i ++) {
// 		playGame(player1, player2);
// 	}
// }
// 	//console.log(player1.score, player2.score);
// 	//playUntil(player1, player2);

// play();
		