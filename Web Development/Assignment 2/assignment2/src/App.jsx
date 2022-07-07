import { useState } from 'react'
import FormInputs from './Components/FormInputs'
import './app.css'

const App = () => {
  const [values, setValues] = useState({
    fullname:"",
    username:"",
    email:"",
    phone:"",
    createPassword:"",
    confirmPassword:""
  });

  const inputs = [
    {
      id:1,
      name:"fullname",
      type:"text",
      placeholder:"Full Name",
      errorMessage:"Full Name cannot contain special characters",
      label:"Full Name",
      pattern: `^[A-Za-z ]{3,20}$`,
      required: true
    },
    {
      id:2,
      name:"username",
      type:"text",
      placeholder:"Username",
      errorMessage:"Username should be 3-16 characters",
      pattern: `^[A-Za-z]{3,16}$`,
      label:"Username",
      required: true
    },
    {
      id:3,
      name:"email",
      type:"email",
      placeholder:"Email",
      errorMessage:"Must be valid email address",
      label:"Email",
      required: true
    },
    {
      id:4,
      name:"phone",
      type:"text",
      placeholder:"Phone",
      label:"Phone"
    },
    {
      id:5,
      name:"createPassword",
      type:"password",
      placeholder:"Create Password",
      errorMessage:"Password should be 8-20 characters",
      label:"Create Password",
      pattern: `^[A-Za-z]{8,20}$`,
      required: true
    },
    {
      id:6,
      name:"confirmPassword",
      type:"password",
      placeholder:"Confirm Password",
      errorMessage:"Passwords dont match",
      label:"Confirm Password",
      pattern: values.createPassword,
      required: true
    }
  ]

  const handleSubmit = (e) => {
    e.preventDefault();
  }

  const onChange = (e) => {
    setValues({ ...values, [e.target.name]: e.target.value })
  }

  console.log(values)
  return (
    <div className='app'>
        <form onSubmit={handleSubmit}>
          <h1>Registration</h1>
          {inputs.map((input) =>( 
            <FormInputs key={input.id} {...input} value={values[input.name]} onChange={onChange}/>
          ))}
          <button>Submit</button>
        </form>
    </div>
  )
}

export default App