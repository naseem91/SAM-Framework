package org.sam.scala.action

import org.sam.scala.model.Model

class Action {

  private val model = new Model
  /*
  The value that the model will mutate to
   */
  private val data = null

  /*
  This is the actual pure function for computing the value it would be mutated to model
  */
  def proposeData(data: String) = {
    /* Do some computation
    .
    .
    */
    model.acceptData(data)
  }

}
