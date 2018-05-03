// https://scastie.scala-lang.org/t0ysyW9kSO2Gw1xiltMBUAo

val bwn = Array("mateloos", "ergeniswekkend", "irritant");
val bnn = Array("zelfzuchtige", "egocentrische", "inhalige");
val ktn = Array("kut", "tiefus", "tering");
val znn = Array("babyboomers", "benidormoverwinteraars", "vijfenzestigplussers");
(for { bw <- bwn; bn <- bnn; kt <- ktn; zn <- znn } yield
  bw + " " + bn + " " + kt + zn).foreach(println(_))
