package org.sam.scala.model

import org.sam.scala.state.State

class Model {

  private var state = new State
  private val data = null

  //make the model singleton
  object Model {

  }
  /*
  Accept or reject for the effect of action
   */
  def acceptData(data: String) = {
    /*
    .
    .
    */
    state.render(this)
  }

  def getData(): String = {
    return data
  }
}
