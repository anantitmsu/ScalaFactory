

class Rational(n: Int, d: Int) {
  require(d != 0)

  private val g = gcd(n.abs, d.abs)

  val numer: Int = n / g
  val denom: Int = d / g

  def this(n: Int) = this(n, 1)

  def +(that: Rational): Rational = {
    new Rational(this.numer * that.denom + this.denom * that.numer, this.denom * that.denom)
  }

  def +(a: Int): Rational = {
    new Rational(this.numer + a * this.denom, this.denom)
  }

  def -(that: Rational): Rational = {
    new Rational(this.numer * that.denom - that.numer * this.denom, this.denom * that.denom)
  }

  def -(a: Int): Rational = {
    new Rational(this.numer - a * this.denom, this.denom)
  }

  override def toString = "Object Created : " + numer + "/" + denom;

  def gcd(a: Int, b: Int): Int = {
    if (b == 0) a else gcd(b, a % b)
  }

}

object App {
  def main(args: Array[String]): Unit = {

    val r1: Rational = new Rational(1, 2);
    val r2: Rational = new Rational(1, 2);

    val r4: Rational = new Rational(1, 10);

    val r3: Rational = r1 + r2;

    val r5: Rational = new Rational(99, 66)

    println(r5);
    println(r3.numer + "/" + r3.denom)

  }
}
