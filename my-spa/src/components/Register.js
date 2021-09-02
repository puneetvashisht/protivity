import React from 'react';
import { Formik, Field, Form, ErrorMessage } from 'formik';
import * as Yup from 'yup';
import Toast from 'react-bootstrap/Toast'

export default class Register extends React.Component {

  
    constructor(){
        super();
        this.state = {message: ''}
    }


    onSubmit = (fields) => {
        alert('SUCCESS!! :-)\n\n' + JSON.stringify(fields, null, 4))
        // post to server using fetch
        fetch('http://localhost:8080/users/', {
            method: "POST",
            body: JSON.stringify(fields),
            headers: {"Content-type": "application/json; charset=UTF-8"}
        })
        .then(res=>{
            console.log(res);
            console.log(res.status)
            if(res.status === 201){
                // setMessage('Course successfully added')
                console.log('Works fine');
                this.setState({message: "User Registered Successfully!!"})
            }
        })
      
    }

    render() {
        return (
            <Formik
                initialValues={{
                    email: '',
                    password: '',
                    confirmPassword: ''
                }}
                validationSchema={Yup.object().shape({
                    email: Yup.string()
                        .email('Email is invalid')
                        .required('Email is required'),
                    password: Yup.string()
                        .min(6, 'Password must be at least 6 characters')
                        .required('Password is required'),
                    confirmPassword: Yup.string()
                        .oneOf([Yup.ref('password'), null], 'Passwords must match')
                        .required('Confirm Password is required')
                })}
                onSubmit={this.onSubmit.bind(this)}
                render={({ errors, status, touched }) => (
                    <>
                    <Toast show={this.state.message} onClose={()=> this.setState({message: null})}>
                    <Toast.Header>
                        <img src="holder.js/20x20?text=%20" className="rounded me-2" alt="" />
                        <strong className="me-auto">Successfully Registered</strong>
                        <small>Just Now</small>
                    </Toast.Header>
                    <Toast.Body>{this.state.message}</Toast.Body>
                    </Toast>
                    <Form>
                        <div className="form-group">
                            <label htmlFor="email">Email</label>
                            <Field name="email" type="text" className={'form-control' + (errors.email && touched.email ? ' is-invalid' : '')} />
                            <ErrorMessage name="email" component="div" className="invalid-feedback" />
                        </div>
                        <div className="form-group">
                            <label htmlFor="password">Password</label>
                            <Field name="password" type="password" className={'form-control' + (errors.password && touched.password ? ' is-invalid' : '')} />
                            <ErrorMessage name="password" component="div" className="invalid-feedback" />
                        </div>
                        <div className="form-group">
                            <label htmlFor="confirmPassword">Confirm Password</label>
                            <Field name="confirmPassword" type="password" className={'form-control' + (errors.confirmPassword && touched.confirmPassword ? ' is-invalid' : '')} />
                            <ErrorMessage name="confirmPassword" component="div" className="invalid-feedback" />
                        </div>
                        <div className="form-group">
                            <button type="submit" className="btn btn-primary mr-2">Register</button>
                            <button type="reset" className="btn btn-secondary">Reset</button>
                        </div>
                    </Form>
                    </>
                )}
            />
        )
    }
}

