    #React
        npm i -g create-react-app
        npx create-react-app <app-name>
        cd <app-name>
        npm start
         
        1. Why react - (performance, features)
        2. Component - reusable part
            a. function that return html
            b. class syntax
        3. Props - Get as inputs : State - belongs to the component
        4. Http communication
            1. native fetch function
            2. Post - Creation, Get - Fetching, Delete - Removal, Put - Updation
        5. Server (Dummy not real) - JSON Server
        6. Single Page Application 
            1. Third party : react-router-dom
        7. Workout {id:1, title:'Backstroke for 10 minutes', cbpm: 50, category: 'Cardio'}
           User {id: 1, email:'user@test.com', password:'abc!xyz@'}
        8. Class vs Functional Components
            FunctionalComponents
                a. Replace state initialization in constructor to useState hook
                b. replace initialization of component to useEffect hook
                c. No using (this) keyword. Explicitly available for class components only.



        Why ReactJS - 
            1. Component based library (reusable components)
            2. Performance (Virtual Dom)
            3. Simple (just using JSX)
            4. Http, SPA, Forms, Charts
        JSX - JS Extension, TS, Dart, CoffeeScript  --> Browsers only understand JS
        Functional & Class
        Props vs States
        Events - Custom events
        Stateful vs Stateless
        Lists - map, unique key to every item
        Styling component - inline, component, global

        Lifecycle of React
            constructor (props) -> initialize state, use props
            render() -> return template
            componentDidMount() --> async 
            shouldComponentUpdate()
            componentDidUpdate()
            render()
            componentWillUnmount
            componentMount
        
        Dynamic Content 
        Forms:
            Controlled: Two way mapping b/w state & form control  (Form validation)
            Uncontrolled: Refs
        Http: Fetch (native) or Axios (third party library)
        Routing: react-router-dom
            1. Declarative routing
            2. Parameters
            3. Nested Routes
            4. Error Handling
        Hooks:
            useState & useEffect:
            useParams

        Application
            1. Header & Footer
            2. SPA
            3. Login/Registration Page (programmtic route navigation)
            4. CRUD
            5. Operation other than CRUD 




