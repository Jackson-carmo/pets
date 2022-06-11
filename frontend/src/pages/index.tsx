import type { NextPage } from 'next'
import Title from '../ui/components/Title/title'
import List from '../ui/components/List/list'

const Home: NextPage = () => {
  return (
    <div >
      <Title 
      title=""
       subtitle={
       <span>
          Com um pequeno valor mensal, você <br />
            pode <strong>adotar um pet virtualmente</strong> 
       </span>} 
       />
      <List 
      pets={[
        {
          id: 1,
          nome: 'Max',
          historia: 'kdjshhdsalkglkajflkjgafdkjlkjalkjafkjkgjfdlk',
          foto: 'https://media.istockphoto.com/photos/crazy-looking-black-and-white-border-collie-dog-say-looking-intently-picture-id1213516345?k=20&m=1213516345&s=612x612&w=0&h=_XUSwcrXe5HjI2QEby0ex6Tl1fB_YJUzUU8o2cUt0YA='
        },
        {
          id: 2,
          nome: 'Mr',
          historia: 'kdjshhdsalkglkajflkjgafdkjlkjalkjafkjkgjfdlk',
          foto: 'https://images.mlssoccer.com/image/private/t_q-best/mls-atl-prd/w8ahb9x3yj76tcrignzy.jpg'
        }
      ]}
      />
    </div>
  )
}

export default Home
