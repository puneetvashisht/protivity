import React, { Component } from 'react'

import { Context, Error, Rules, Form, Input } from 'react-form-validation';


/**
 * Simple login form.
 */
export default class LoginForm extends Component {
	/**
	 * Constructor.
	 */
	constructor(props) {
		super(props);

		this.state = {
			context: new Context({
				fields: {
					email: Rules.required().email(),
					password: Rules.required()
				}
			})
		};
	}

	/**
	 * Renders the form.
	 */
	render() {
		return (
			<Form context={this.state.context}>
				<h4>Login</h4>
				<div className="field">
					Email: <Input type="text" name="email" />
					<Error htmlFor="email" />
				</div>
				<div className="field">
					Password: <Input type="password" name="password" />
					<Error htmlFor="password" />
				</div>
				<div className="actions">
					<button>Submit</button>
					<button type="button">
						Show Data
					</button>
				</div>
			</Form>
		);
	}
}