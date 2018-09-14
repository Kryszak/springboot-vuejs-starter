import ExamplePath from './components/ExamplePath';
import NotFound from './components/NotFound';

export default [
    {path: '/main', component: ExamplePath},
    {path: '/', redirect: "/main"},
    {path: '*', component: NotFound}
];
