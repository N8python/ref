case class &[T](var value: T){
  def unary_~ = value
  def :=(newval: T) = value = newval
}
