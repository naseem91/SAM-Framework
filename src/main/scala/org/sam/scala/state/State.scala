package org.sam.scala.state

import org.sam.scala.action.Action
import org.sam.scala.model.Model

class State {

  var action = new Action

  /*
  Trigger the state representation rendering
   */
  def render(model: Model) = {}

  /*
  Process the next-action predicate
   */
  def nap(model: Model): Action = {
    //Add processing
    this.action
  }

}
