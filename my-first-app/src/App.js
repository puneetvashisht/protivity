import {useState} from 'react';
import Badge from './component/Badge'
import './App.css';
import Clock from './component/Clock';
import Card from './component/Card';
import BadgeUsingClass from './component/BadgeUsingClass';
import Message from './component/Message';

function App() {

  const [courses, setCourses] = useState([
    {title: 'Angular', summary: 'Framework from google!!'},
    {title: 'React', summary: 'Library from facebook!!'}
  ]);

  return (
    
    <div>
      <h2>First react application</h2>

      <Message text="Good Morning!!"></Message>

      <Badge caption="Inbox" count="34"></Badge>
      <Badge caption="Sent" count="23"></Badge>

      <BadgeUsingClass caption="Using Class Syntax" count="34"></BadgeUsingClass>


      <Clock></Clock>

     
      <Card title="Angular"></Card>
      <Card title="React"></Card>
    </div>
  );
}

export default App;
