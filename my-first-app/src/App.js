import Badge from './component/Badge'
import './App.css';
import Clock from './component/Clock';
import Card from './component/Card';

function App() {
  return (
    <div>
      <h2>First react application</h2>
      <Badge caption="Inbox" count="34"></Badge>
      <Badge caption="Sent" count="23"></Badge>
      <Clock></Clock>
      <Card title="Angular"></Card>
      <Card title="React"></Card>
    </div>
  );
}

export default App;
